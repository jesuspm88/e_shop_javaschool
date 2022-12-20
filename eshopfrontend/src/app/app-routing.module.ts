import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CategoriesComponent } from './pages/categories/categories.component';
import { CreateCategoryComponent } from './pages/categories/views/create/create-category.component';
import { EditCategoryComponent } from './pages/categories/views/edit/edit-category.component';
import { DetailsCategoryComponent } from './pages/categories/views/details/details-category.component';
import { OrdersComponent } from './pages/orders/orders.component';
import { CreateOrderComponent } from './pages/orders/views/create/create-order.component';
import { DetailsOrderComponent } from './pages/orders/views/details/details-order.component';
import { EditOrderComponent } from './pages/orders/views/edit/edit-order.component';
import { ProductsComponent } from './pages/products/products.component';
import { CreateProductComponent } from './pages/products/views/create/create-product.component';
import { DetailsProductComponent } from './pages/products/views/details/details-product.component';
import { EditProductComponent } from './pages/products/views/edit/edit-product.component';

const routes: Routes = [
  {path: '', redirectTo: '/product/all', pathMatch: 'full'},
  {path: 'product/all', component: ProductsComponent},
  {path: 'product/add', component: CreateProductComponent},
  {path: 'product/:id/update', component: EditProductComponent},
  {path: 'product/:id', component: DetailsProductComponent},
  {path: 'order/all', component: OrdersComponent},
  {path: 'order/add', component: CreateOrderComponent},
  {path: 'order/:id/update', component: EditOrderComponent},
  {path: 'order/:id', component: DetailsOrderComponent},
  {path: 'category/all', component: CategoriesComponent},
  {path: 'category/add', component: CreateCategoryComponent},
  {path: 'category/:id/update', component: EditCategoryComponent},
  {path: 'category/:id', component: DetailsCategoryComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { 
  
}
