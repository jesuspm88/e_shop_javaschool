import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddressesComponent } from './pages/addresses/addresses.component';
import { CreateAddressComponent } from './pages/addresses/views/create/create-address.component';
import { DetailsAddressComponent } from './pages/addresses/views/details/details-address.component';
import { EditAddressComponent } from './pages/addresses/views/edit/edit-address.component';
import { CategoriesComponent } from './pages/categories/categories.component';
import { CreateCategoryComponent } from './pages/categories/views/create/create-category.component';
import { DetailsCategoryComponent } from './pages/categories/views/details/details-category.component';
import { EditCategoryComponent } from './pages/categories/views/edit/edit-category.component';
import { CreateOrderComponent } from './pages/orders/views/create/create-order.component';
import { DetailsOrderComponent } from './pages/orders/views/details/details-order.component';
import { EditOrderComponent } from './pages/orders/views/edit/edit-order.component';
import { OrdersComponent } from './pages/orders/orders.component';
import { ProductsComponent } from './pages/products/products.component';
import { CreateProductComponent } from './pages/products/views/create/create-product.component';
import { DetailsProductComponent } from './pages/products/views/details/details-product.component';
import { EditProductComponent } from './pages/products/views/edit/edit-product.component';
import { UsersComponent } from './pages/users/users.component';
import { EditUserComponent } from './pages/users/views/edit/edit-user.component';
import { CreateUserComponent } from './pages/users/views/create/create-user.component';
import { DetailsUserComponent } from './pages/users/views/details/details-user.component';

@NgModule({
  declarations: [
    AppComponent,
    AddressesComponent,
    CreateAddressComponent,
    DetailsAddressComponent,
    EditAddressComponent,
    CategoriesComponent,
    CreateCategoryComponent,
    DetailsCategoryComponent,
    EditCategoryComponent,
    CreateOrderComponent,
    DetailsOrderComponent,
    EditOrderComponent,
    OrdersComponent,
    ProductsComponent,
    CreateProductComponent,
    DetailsProductComponent,
    EditProductComponent,
    UsersComponent,
    CreateUserComponent,
    DetailsUserComponent,
    EditUserComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
