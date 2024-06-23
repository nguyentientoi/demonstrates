import { Col, Form, Input, Row } from "reactstrap";
import AgGrid from "../../components/AgGrid";

const ChannelList = () => { 
  return (<>
    <Form>
      <Row>
        <Col md={3}>Channel</Col>
        <Col md={3}><Input bsSize="sm" name="channel" /></Col>
      </Row>
    </Form>
    <Row style={{ height: '300px' }}>
      <Col>
        <AgGrid columnDefs={colDefs} onGridReady={[]} />
      </Col>
    </Row>
  </>);
}

const colDefs = [
  { header: 'No', width: '80', field: 'no' },
  { header: 'Channel', width: '120', field: 'channel' }
];

export default ChannelList;
