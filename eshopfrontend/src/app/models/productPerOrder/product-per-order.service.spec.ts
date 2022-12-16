import { TestBed } from '@angular/core/testing';

import { ProductPerOrderService } from './product-per-order.service';

describe('ProductPerOrderService', () => {
  let service: ProductPerOrderService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ProductPerOrderService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
