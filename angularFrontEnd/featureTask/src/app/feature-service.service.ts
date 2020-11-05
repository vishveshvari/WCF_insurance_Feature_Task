import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})

export class FeatureServiceService {

  constructor(private http:HttpClient) { }

  public getAllFeatures(){
    return this.http.get("http://localhost:8080/api/get/allfeatures");
  }

  public doSubmission(feature){
    return this.http.post("http://localhost:8080/api/feature/create",feature,{responseType:'text' as 'json'});
  }

}
