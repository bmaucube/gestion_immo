import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PersonneDetailsComponent } from './personne-details.component';

describe('PersonneDetailsComponent', () => {
  let component: PersonneDetailsComponent;
  let fixture: ComponentFixture<PersonneDetailsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PersonneDetailsComponent]
    });
    fixture = TestBed.createComponent(PersonneDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
