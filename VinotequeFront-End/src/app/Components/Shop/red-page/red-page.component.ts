import { Component } from '@angular/core';
import { Wine } from 'src/app/Model/Wine';
import { WineService } from 'src/app/Services/wine.service';

@Component({
  selector: 'app-red-page',
  templateUrl: './red-page.component.html',
  styleUrls: ['./red-page.component.css']
})
export class RedPageComponent {

  constructor(private wineService:WineService){}
  wines !: Wine[]

  ngOnInit(): void {

    window.scrollY

    if(!(this.wineService.wines != undefined || null)){
      this.takeWines();
    } else {
      this.wines = this.wineService.wines
    }
  }



  takeWines(){
    this.wineService.geRedtWines().subscribe(data=> {
      this.wines = data;
      this.wineService.wines = data;
    })
  }

}
