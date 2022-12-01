import Service from "./Service4.js";
const handleClickTable = (e) => {
    const myarr = e.thoiLuong.split(" ");
    e.thoiLuong = myarr[0];
    $$('formP').setValues(e);

};
const formPhim = () => ({
    view: "form",
    id: "formP",
    padding: 10,
    elements: [
        // {rows:[{
        //     view:"label",
        //     label:"<img src='/Image/poster/#hinh#' style='height:200px, width:100%'>",
        //     // name:"hinh",
        //     id:"hinh",
        //     height:200
        // }]},
        { view: "text", name: "maPhim", label: "Mã Phim", labelWidth: 120 },
        { view: "text", name: "tenPhim", label: "Tên Phim", labelWidth: 120 },
        { view: "text", name: "dienVien", label: "Diễn Viên", labelWidth: 120 },
        { view: "text", name: "namSX", label: "Năm Sản Xuất", labelWidth: 120 },
        { view: "text", name: "daoDien", label: "Đạo Diễn", labelWidth: 120 },
        { view: "text", name: "quocGia", label: "Quốc Gia", labelWidth: 120 },
        {
            cols: [
                { view: "text", name: "thoiLuong", label: "Thời Lượng", labelWidth: 120 },
                { view: "label", name: "label", label: "Phút", labelWidth: 30 },
            ]
        },
        { view: "textarea", name: "moTa", label: "Mô tả", labelWidth: 120, height: 100 },
        { view: "text", name: "traller", label: "Traller", labelWidth: 120 },
        {
            cols: [
                { view: "button", value: "Thêm", css: "webix_primary", click: Service.clickThem },
                { view: "button", value: "Xóa", click: Service.clickDelete },
                { view: "button", value: "Sửa", click: Service.clickUpdate },
                { view: "button", value: "Mới", click: Service.clickNew }
            ]
        }
    ]

})
const tablePhim = () => ({
    view: "datatable",
    id: "tableP",
    css: "webix_data_border webix_header_border",
    columns: [
        { id: "hinh", header: "Hình", template: "<img src='/Image/poster/#hinh#' style='height:60px'/>", width: 60 },
        { id: "maPhim", header: "Mã Phim", width: 60, resize: false },
        { id: "tenPhim", header: "Tên Phim", width: 300 },
        { id: "dienVien", header: "Diễn Viên", width: 200 },
        { id: "namSX", header: "Năm Sản Xuất", width: 50 },
        { id: "daoDien", header: "Đạo Diễn", width: 200 },
        { id: "quocGia", header: "Quốc Gia", width: 90 },
        { id: "thoiLuong", header: "Thời Lượng", width: 80 },
        { id: "moTa", header: "Mô Tả", fillspace: true },
        { id: "traller", header: "Trailler", fillspace: true }
    ],

    data: [],
    fixedRowHeight: false, rowLineHeight: 25, rowHeight: 80,
    select: true,
    on: {
        onItemClick: function (id) {
            handleClickTable(this.getSelectedItem());

        }
    },
    scrollX: false
})

const p = () => ({
    view: "form",
    id: "qlp",
    rows: [
        formPhim(),
        tablePhim()

    ],
    scroll: true
})
export default p();