import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { NormasService } from './normas.service';

@Component({
  selector: 'app-normas',
  templateUrl: './normas.component.html',
  styleUrls: ['./normas.component.css']
})
export class NormasComponent implements OnInit {

  normas: any;
  currentNormas = null;
  currentIndex = -1;
  title = '';
  @Output() showNavbarEvent = new EventEmitter();

  constructor(private normasService: NormasService) { }

  ngOnInit(): void {
    this.retrieveNormas();
    this.showNavbarEvent.emit({showNavbar : true});
  }

  retrieveNormas(): void {
    this.normasService.getAll()
      .subscribe(
        data => {
          this.normas = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }

  refreshList(): void {
    this.retrieveNormas();
    this.currentNormas = null;
    this.currentIndex = -1;
  }

  setActiveNormas(tutorial, index): void {
    this.currentNormas = tutorial;
    this.currentIndex = index;
  }

}
