import { Component, OnInit } from '@angular/core';
import { FeatureServiceService } from '../feature-service.service';
import { Feature } from '../Feature'

@Component({
  selector: 'app-feature',
  templateUrl: './feature.component.html',
  styleUrls: ['./feature.component.css']
})

export class FeatureComponent implements OnInit {

  constructor(private service:FeatureServiceService) { }

    feature : Feature;
    message: any;
    ngOnInit() {

    }

    public submitNow(){
      let resp = this.service.doSubmission(this.feature);
      resp.subscribe((data)=>this.message=data);
    }


}
