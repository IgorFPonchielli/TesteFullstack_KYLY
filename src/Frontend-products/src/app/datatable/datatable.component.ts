import { Component, OnInit } from '@angular/core';
declare var jQuery: any;

@Component({
  selector: 'app-datatable',
  templateUrl: './datatable.component.html',
  styleUrls: ['./datatable.component.css']
})
export class DatatableComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
    (function ($) {

      $(document).ready(function () {

        var table = $('#mainTable').DataTable({
          ajax: {
            url: 'http://localhost:8080/api/product/list',
            dataSrc: ''
          },
          columns: [
            { data: 'produtoId' },
            { data: 'produto' },
            { data: 'descProduto' },
            { data: 'cor' },
            { data: 'descCor' },
            { data: 'tamanho' },
            { data: 'descTamanho' }],
            pageLength: 15,
            lengthMenu: [5, 15, 20, 50, 100],
            searching: true,
            language: {
              url: 'http://cdn.datatables.net/plug-ins/1.10.20/i18n/Portuguese-Brasil.json'
          }
            
        });
        
          //Buscar dado por ID do produto
          $('#btnearchById').click(function () {
            
            var inputSearchIdValue = $('#inputSearchById').val();

            if (inputSearchIdValue == "" || inputSearchIdValue == null) {
              table.search( '' ).columns().search( '' ).draw();
            } else {
              table.columns(0).search("^" + inputSearchIdValue + "$", true, false, true).draw();
            }   
            
          } );

          $('#inputSearchById').on("click change", function () {
            
            var inputSearchIdValue = $('#inputSearchById').val();

            if (inputSearchIdValue == "" || inputSearchIdValue == null) {
              table.search( '' ).columns().search( '' ).draw();
            } 
            
          } );

      });



    })(jQuery);
  }

}
