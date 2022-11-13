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
        { view: "text", name: "tenPhim", label: "Tên Phim", labelWidth: 120 },
        { view: "text", name: "namSX", label: "Năm Sản Xuất", labelWidth: 120 }, {
            cols: [
                { view: "text", name: "thoiLuong", label: "Thời Lượng", labelWidth: 120 },
                { view: "label", name: "label", label: "Phút", labelWidth: 30 },
            ]
        },
        { view: "text", name: "quocGia", label: "Quốc Gia", labelWidth: 120 },
        { view: "text", name: "daoDien", label: "Đạo Diễn", labelWidth: 120 },
        { view: "text", name: "dienVien", label: "Diễn Viên", labelWidth: 120 },
        { view: "textarea", name: "moTa", label: "Mô tả", labelWidth: 120, height: 100 },
        { view: "text", name: "traller", label: "Traller", labelWidth: 120 },
        {
            cols: [
                {
                    view: "button",
                    value: "Save",
                    css: "webix_primary",
                    click: function () {
                        let data = $$('formP').getValues();
                        console.log(data);
                        $$('tableP').parse(data)
                    }
                },
                { view: "button", value: "Xóa", },
                { view: "button", value: "Sửa", },
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
        { id: "maPhim", header: "Mã Phim", width: 60, resize: false },
        { id: "tenPhim", header: "Tên Phim", width: 300 },
        { id: "namSX", header: "Năm Sản Xuất", width: 50 },
        { id: "thoiLuong", header: "Thời Lượng", width: 80 },
        { id: "quocGia", header: "Quốc Gia", width: 90 },
        { id: "daoDien", header: "Đạo Diễn", width: 200 },
        { id: "dienVien", header: "Diễn Viên", width: 200 },
        { id: "moTa", header: "Mô Tả", fillspace: true },
        { id: "traller", header: "Trailler", fillspace: true }
    ],
    data: [],
    fixedRowHeight: false, rowLineHeight: 25, rowHeight: 25,
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

    ]
})
export default p();