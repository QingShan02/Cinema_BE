import Service from './QLNV/Service.js';
import doanhthu from './DoanhThu/main.js';
import ve from './Ve/main.js';
import nv from './QLNV/main.js';
import Service1 from './Ve/Service1.js';
import Service2 from './DoanhThu/Service2.js';
var menu_data = [{
    id: "dashboard",
    icon: "mdi mdi-view-dashboard",
    value: "Doanh thu",
    data: [
        { id: "ve", value: "Vé" },
        { id: "dashboard2", value: "Doanh thu" },
        { id: "qlnv", value: "Quản lí nhân viên" }
    ]
}, ]
webix.ready(() => {
    webix.ui({
        rows: [{
            cols: [{
                    width: 200,
                    view: "sidebar",
                    data: menu_data,
                    on: {
                        onAfterSelect: function(id) {
                            $$('form_view').setValue(id)
                        }
                    }
                },
                {
                    id: 'form_view',
                    cells: [
                        ve,
                        doanhthu,
                        nv
                    ]
                }

            ]

        }]
    })
    Service.fillTable();
    Service.fillChucVu();
    Service1.fillTable();
    Service2.fillTable();
    Service1.fillphim();

})