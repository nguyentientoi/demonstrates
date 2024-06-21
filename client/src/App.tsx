import { ReactNode } from 'react'
import { Route, Routes } from "react-router-dom"
import './App.css'
import Login from './pages/Auth/Login';
import ChannelList from './pages/Channel/ChannelList';
import Layout from './components/Layout';

interface RouteProps {
  path: string;
  component: ReactNode;
  standalone?: boolean;
  anonymous?: boolean;
}

const routes: Array<RouteProps> = [
  { path: '/', component: <ChannelList /> },
  { path: '/channel', component: <ChannelList /> }
];


function App() {
  // const location = useLocation();
  // const path = location?.pathname?.toLowerCase() ?? "";
  const loginToken = localStorage.getItem("auth-token");
  if (!loginToken) {
    return (
      <>
        <Routes>
          <Route path="*" element={<Login />} />
        </Routes>
      </>
    );
  }

  return (
    <>
      <Routes>
        {routes.map((route, index) => (
          <Route
            path={route.path}
            element={
              route.standalone ? (<>{route.component}</>) : (<Layout>{ route.component }</Layout>)
            }
            key={index}
          />
        )) }
      </Routes>
    </>
  )
}

export default App
