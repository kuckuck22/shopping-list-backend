import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import { FormsModule } from '@angular/forms';
import {AppComponent} from './app.component';
import {ShoppingService} from "./shared/shopping/shopping.service";
import {ShoppingListComponent} from './shopping-list/shopping-list/shopping-list.component';
import {HttpClientModule} from "@angular/common/http";
import {
  MatButtonModule,
  MatCardModule,
  MatDialogModule,
  MatIconModule,
  MatInputModule,
  MatListModule,
  MatTableModule,
  MatToolbarModule,

} from "@angular/material";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {AddItemDialogComponent} from './shopping-list/add-item-dialog/add-item-dialog.component';


@NgModule({
  declarations: [
    AppComponent,
    ShoppingListComponent,
    AddItemDialogComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatCardModule,
    MatInputModule,
    MatListModule,
    MatToolbarModule,
    MatTableModule,
    MatIconModule,
    MatDialogModule,
    FormsModule
  ],
  providers: [ShoppingService],
  bootstrap: [AppComponent],
  entryComponents: [AddItemDialogComponent]
})
export class AppModule { }
