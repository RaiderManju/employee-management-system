// src/pages/EmployeeTable.js
import React from "react";

function EmployeeTable({ employees }) {
  return (
    <table
      border="1"
      cellPadding="5"
      cellSpacing="0"
      style={{
        margin: "50px auto",
        borderCollapse: "collapse",
        width: "80%",
      }}
    >
      <thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Position</th>
          <th>Department</th>
        </tr>
      </thead>
      <tbody>
        {employees.map(emp => (
          <tr key={emp.id}>
            <td>{emp.id}</td>
            <td>{emp.name}</td>
            <td>{emp.position}</td>
            <td>{emp.department}</td>
          </tr>
        ))}
      </tbody>
    </table>
  );
}

export default EmployeeTable;
