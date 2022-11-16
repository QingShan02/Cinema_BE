import Service from './QLNV/Service.js';
import doanhthu from './DoanhThu/main.js';
import ve from './Ve/main.js';
import nv from './QLNV/main.js';
import Service1 from './Ve/Service1.js';
import Service2 from './DoanhThu/Service2.js';
import Service3 from './QLLC/Service3.js';
import Service4 from './QLP/Service4.js';
import lc from './QLLC/main.js';
import p from './QLP/main.js';
var menu_data = [{
    id: "dashboard",
    icon: "mdi mdi-view-dashboard",
    value: "Mục lục",
    data: [
        { id: "ve", value: "Vé" },
        { id: "dashboard2", value: "Doanh thu" },
        { id: "qlnv", value: "Quản lí nhân viên" },
        { id: "qllc", value: "Quản lí lịch chiếu" },
        { id: "qlp", value: "Quản lí phim" }
    ]
},]
webix.ready(() => {
    webix.ui({
        rows: [{
            cols: [{
                width: 200,
                view: "sidebar",
                data: menu_data,
                on: {
                    onAfterSelect: function (id) {
                        $$('form_view').setValue(id)
                    }
                }
            },
            {
                id: 'form_view',
                cells: [
                    ve,
                    doanhthu,
                    nv,
                    lc,
                    p
                ]
            }

            ]

        }]
    })
    Service.fillTable();
    Service.fillChucVu();
    Service1.fillTable();
    Service1.fillphim();
    Service2.fillTable();
    Service3.LoadChiNhanh();
    Service3.LoadPhim();
    Service3.LoadTableLichChieu();
    Service4.FillTablePhim();
})