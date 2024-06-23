import { AgGridReact } from "ag-grid-react";
import { forwardRef, useState } from "react";

const AgGrid = forwardRef((props: any, ref: any) => {
    const [colDefs] = useState<any>(props.columnDefs);
    const [data] = useState<any>([]);
    return (<>
        <div className={"ag-theme-quartz"} style={{ width: '100%', height: '100%' }}>
          <AgGridReact ref={ref} 
            columnDefs={colDefs} 
            onGridReady={props.onGridReady}
            rowData={data}
            />
        </div>
    </>);
});

export default AgGrid;