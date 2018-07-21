import {Component, OnInit, ViewChild} from '@angular/core';
import {ShoppingService} from "../../shared/shopping/shopping.service";
import {MatTable} from "@angular/material";

@Component({
  selector: 'app-shopping-list',
  templateUrl: './shopping-list.component.html',
  styleUrls: ['./shopping-list.component.css']
})

export class ShoppingListComponent implements OnInit {
  displayedColumns: string[] = ['id', 'name', 'amount', 'delete'];
  shoppingItems: Array<any>;

  @ViewChild(MatTable) table: MatTable<any>;

  constructor(private shoppingService: ShoppingService) { }

  ngOnInit() {
    this.shoppingService.getItems().subscribe(data => {
      this.shoppingItems = data;
    });
  }

  public removeItem(id: number) {
    this.shoppingService.removeItem(id).subscribe();
    this.shoppingItems = this.shoppingItems.filter(function(item) {
      return item.id !== id
    });
    this.table.renderRows();
  }

  public addItem(item: any) {
    this.shoppingItems.push(item);
    this.table.renderRows();
  }

}
