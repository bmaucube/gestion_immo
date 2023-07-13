import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CretePersonneComponent } from './crete-personne.component';

describe('CretePersonneComponent', () => {
  let component: CretePersonneComponent;
  let fixture: ComponentFixture<CretePersonneComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CretePersonneComponent]
    });
    fixture = TestBed.createComponent(CretePersonneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
