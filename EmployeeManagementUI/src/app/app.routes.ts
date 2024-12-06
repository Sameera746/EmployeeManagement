import { Routes } from '@angular/router';
import { EmployeeTableComponent } from './employee-table/employee-table.component';

export const routes: Routes = [
    {
        path:"employees",
        component:EmployeeTableComponent
    }
];
