import Service from './QLNV/Service.js';

import nv from './QLNV/main.js';
import Service2 from './DoanhThu/Service2.js';
import Service3 from './QLLC/Service3.js';
import Service4 from './QLP/Service4.js';
import Service5 from './QLKH/Service5.js';
import Service6 from './ThongKe/Service6.js';
import kh from './QLKH/main.js';
import tk from './ThongKe/main.js';
import lc from './QLLC/main.js';
import p from './QLP/main.js';
var menu_data = [{
    id: "dashboard",
    icon: "mdi mdi-view-dashboard",
    value: "Mục lục",
    data: [
//        { id: "ve", value: "Vé" },
//        { id: "dashboard2", value: "Doanh thu" },
         { id: "qlnv", value: "Quản lí nhân viên" },
        { id: "qllc", value: "Quản lí lịch chiếu" },
        { id: "qlp", value: "Quản lí phim" },
        { id: "qlkh", value: "Quản lí khách hàng" },

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
                    tk,
//                    ve,
//                    doanhthu,
                     nv,
                    lc,
                    p,
                    kh

                ]
            }

            ]

        }]
    })
     Service.fillTable();
     Service.fillChiNhanh();
    Service2.fillTable();
    Service3.LoadChiNhanh();
    Service3.LoadPhim();
    Service3.LoadTableLichChieu();
    Service4.FillTablePhim();
    Service5.fillTableKH();
    Service6.FillCboChiNhanh();
    Service6.FillChart('cn1');
    Service6.FillTable('cn1');
})