import { TestBed } from '@angular/core/testing';

import { ProductPerBucketService } from './product-per-bucket.service';

describe('ProductPerBucketService', () => {
  let service: ProductPerBucketService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ProductPerBucketService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
