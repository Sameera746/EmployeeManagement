import { Component } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { AgGridModule } from 'ag-grid-angular';
import { FormsModule } from '@angular/forms';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-employee-table',
  imports:[AgGridModule, FormsModule],
  providers:[EmployeeService],
  templateUrl: './employee-table.component.html',
  styleUrls: ['./employee-table.component.scss'],
})
export class EmployeeTableComponent {
  columnDefs = [
    { field: 'empId', headerName: 'ID', sortable: true, filter: true },
    { field: 'empName', headerName: 'Name', sortable: true, filter: true },
    { field: 'empSalary', headerName: 'Salary', sortable: true, filter: true },
    { field: 'department.depName', headerName: 'Department', sortable: true, filter: true },
  ];

  rowData: any[] = [];
  departmentName: string = '';

  constructor(private employeeService: EmployeeService) {}

  getTop10Employees() {
    if (!this.departmentName) {
      alert('Please enter a department name!');
      return;
    }
    this.employeeService
      .getTop10EmployeesByDepartment(this.departmentName)
      .subscribe((data) => {
        this.rowData = data;
      });
  }

  getHighestEarningEmployees() {
    this.employeeService.getHighestEarningEmployees().subscribe((data) => {
      this.rowData = data;
    });
  }
}
