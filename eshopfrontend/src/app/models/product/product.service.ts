import { Injectable } from '@angular/core';
import { Observable } from "rxjs";
import { Product } from "./product";
import { HttpClient } from '@angular/common/http';
import { environment } from "src/environments/environment";

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  public apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getProducts(): Observable<Product[]>{
    return this.http.get<Product[]>(this.apiServerUrl + '/products/all')
}

public addProducts(product: Product): Observable<Product>{
    return this.http.post<Product>(this.apiServerUrl + '/products/add', product);
}

public deleteProduct(id: number): Observable<void>{
    return this.http.delete<void>(this.apiServerUrl + '/products/delete/' + id);
}
}
