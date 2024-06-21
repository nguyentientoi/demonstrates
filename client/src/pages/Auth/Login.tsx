import { Button, Card, CardBody, CardFooter, CardHeader, Col, Form, Input, Row } from "reactstrap";
import { APP_URL } from "../../common/config";
const Login = () => { 

  const onSubmit = async (e: React.FormEvent<HTMLFormElement>) => { 
    e.preventDefault();
    const formData = new FormData(e.currentTarget);
    const data = Object.fromEntries(formData);
    const result = await fetch(APP_URL + '/authen', {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(data),
    });

    const json = await result.json(); 
    if (json && undefined != json.jwt) {
      // console.log('json: ', json.jwt);
      localStorage.setItem('auth-token', json.jwt);
      location.href = APP_URL + '/';
    } else { 
      alert('Login failed!');
    }
  }

  return (<>
    <div className="login-page" style={{ height: '100vh' }}>
      <div className="header pt-3 pb-3 header">
        <Row>
          <Col md={3}>Logo</Col>
          <Col></Col>
        </Row>
      </div>
      <div className="body">
        <Row>
          <Col md={4}></Col>
          <Col md={4}>
            <div className="form-login d-flex justify-content-center pt-3">
            <Form onSubmit={onSubmit}>
              <Card style={{ width: '400px' }}>
                <CardHeader>
                  Login
                </CardHeader>
                <CardBody>
                    <Row>
                      <Col md={4}>User name:</Col>
                      <Col md={8}><Input name="username" required bsSize="sm" className="mb-3"/></Col>
                    </Row>
                    <Row>
                      <Col md={4}>Password:</Col>
                      <Col md={8}><Input name="password" required bsSize="sm" className="mb-3" /></Col>
                    </Row>
                </CardBody>
                <CardFooter className="text-end">
                  <Button size="sm" type="submit">Login</Button>
                </CardFooter>
              </Card>
              </Form>
            </div>
          </Col>
          <Col md={4}></Col>
        </Row>
      </div>
      <div className="footer text-center">
        {"Footer sample Test"}
      </div>
    </div>
  </>);
}
export default Login;
