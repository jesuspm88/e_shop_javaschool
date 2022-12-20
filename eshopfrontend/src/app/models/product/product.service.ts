import { Injectable } from '@angular/core';
import { Observable } from "rxjs";
import { Product } from "./product";
import { HttpClient } from '@angular/common/http';
import { environment } from "src/environments/environment";

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  public apiServerUrl = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  public getProducts(): Observable<Product[]>{
    return this.http.get<Product[]>(this.apiServerUrl + '/product/all')
}

public addProducts(product: Product): Observable<Product>{
    return this.http.post<Product>(this.apiServerUrl + '/product/add', product);
}

public deleteProduct(id: number): Observable<void>{
    return this.http.delete<void>(this.apiServerUrl + '/product/delete/' + id);
}
}
