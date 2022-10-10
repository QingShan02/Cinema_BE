import Service from './QLNV/Service.js';
import doanhthu from'./DoanhThu/main.js';
import ve from './Ve/main.js';
import nv from './QLNV/main.js'
const handleClickTable = (e) => {
    e.gioiTinh = (e.gioiTinh === "Nam") ? 1 : 0;
    $$('form').setValues(e);
    e.gioiTinh = (e.gioiTinh == 0) ? "Nữ" : "Nam"
};
var menu_data = [
    {
        id: "dashboard", icon: "mdi mdi-view-dashboard", value: "Doanh thu", data: [
            { id: "dashboard1", value: "Vé" },
            { id: "dashboard2", value: "Doanh thu" },
            { id: "qlnv", value: "Quản lí nhân viên" }
        ]
    },]
webix.ready(() => {
    webix.ui({
        rows: [
            {
                cols: [
                    {
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
                            nv
                        ]
                    }

                ]

            }]
    })
    Service.fillTable();
})

