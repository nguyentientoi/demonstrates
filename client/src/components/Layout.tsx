import { ReactNode } from "react";
import { NavLink } from "react-router-dom";
import { Col, Nav, NavItem, Row } from "reactstrap";

interface LayoutProps {
  children: ReactNode;
}

const Layout = (props: LayoutProps) => { 
  return (<>
    <div>
      <div className="header">Sampe test</div>
      <Row>
        <Col md={2}>
          <div className="menu">
            <Nav vertical>
              <NavItem>
                <NavLink to={'/channel'}>Channel List</NavLink>
              </NavItem>
            </Nav>
          </div>
        </Col>
        <Col md={10}>
        <div className="body">
          { props.children }
        </div>
        </Col>
      </Row>
      <div className="footer text-center">Sample test</div>
    </div>
    
  </>);
}

export default Layout;
