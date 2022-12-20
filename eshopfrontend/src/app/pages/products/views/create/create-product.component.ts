import { Component, OnInit } from '@angular/core';
import { ProductService } from 'src/app/models/product/product.service';

@Component({
  selector: 'app-create-product',
  templateUrl: './create-product.component.html',
  styleUrls: ['./create-product.component.css']
})
export class CreateProductComponent implements OnInit {
  products:any = [];

  constructor(product:ProductService) {
    this.products = product.getProducts();
   }

  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

}
