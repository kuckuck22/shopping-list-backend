import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable} from 'rxjs/index';

@Injectable({
  providedIn: 'root'
})
export class ShoppingService {

  constructor(private http: HttpClient) { }

  getItems(): Observable<any> {
    return this.http.get('//localhost:8081/getItems');
  };

  addItem(shoppingItem: any){
    this.http.post('//localhost:8081/addItem', shoppingItem);
  }

  updateItem(shoppingItem: any) {
    this.http.post('//localhost:8081/updateItem', shoppingItem);
  }

  removeItem(itemId: number): Observable<any> {
    return this.http.delete('//localhost:8081/removeItem?id=' + itemId);
  }

  removeAll(): Observable<any> {
    return this.http.delete('//localhost:8081/clearShoppingList');
  }

}
