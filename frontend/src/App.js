import React, {useState, useEffect} from 'react';
function App(){
  const [payments,setPayments]=useState([]);
  useEffect(()=>{ /* fetch from backend when available */ },[]);
  return (<div style={{padding:20}}><h2>Payments Dashboard</h2><p>Sample frontend. Connect to backend at /api/payments</p></div>);
}
export default App;
