import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class EmployeeService {
  private BASE_URL = 'http://localhost:8080'; 

  constructor(private http: HttpClient) {}

  getTop10EmployeesByDepartment(departmentName: string): Observable<any> {
    return this.http.get(`${this.BASE_URL}/employees/top10`, {
      params: { departmentName },
    });
  }

  getHighestEarningEmployees(): Observable<any> {
    return this.http.get(`${this.BASE_URL}/employees/highest-earning`);
  }
}
