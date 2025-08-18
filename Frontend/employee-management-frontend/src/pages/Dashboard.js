// src/pages/Dashboard.js
import React from "react";
import employees from "../employees.json";
import EmployeeTable from "./EmployeeTable";

function Dashboard() {
  return (
    <div>
      <h2 style={{ textAlign: "center" }}>Employee List</h2>
      <EmployeeTable employees={employees} />
    </div>
  );
}

export default Dashboard;
