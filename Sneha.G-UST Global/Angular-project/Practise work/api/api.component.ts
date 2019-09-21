import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-api',
  templateUrl: './api.component.html',
  styleUrls: ['./api.component.css']
})
export class ApiComponent implements OnInit {

  github: any [] = [];

  constructor(private http: HttpClient) {
    http.get<any>(`https://api.github.com/users`)
    .subscribe(resData => {
      this.github = resData;
    }) ;
  }

  deletUser(info)
  {
    let index = this.github.indexOf(info);
    this.github.splice(index,1);
  }

  ngOnInit() {
  }

}
