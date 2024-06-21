import { ReactNode } from "react";

interface LayoutProps {
  children: ReactNode;
}

const Layout = (props: LayoutProps) => { 
  return (<>
    { props.children }
  </>);
}

export default Layout;
