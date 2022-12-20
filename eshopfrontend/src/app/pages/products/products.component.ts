import { Component } from '@angular/core';
import { Product } from 'src/app/models/product/product';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent {
public products: Product[] = [];

}
