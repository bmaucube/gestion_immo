import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateImmeubleComponent } from './create-immeuble.component';

describe('CreateImmeubleComponent', () => {
  let component: CreateImmeubleComponent;
  let fixture: ComponentFixture<CreateImmeubleComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CreateImmeubleComponent]
    });
    fixture = TestBed.createComponent(CreateImmeubleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
