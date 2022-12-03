import Service6 from "./Service6.js";

const tableThongKe = () => ({
    view: "datatable",
    id: "tableTK",
    columns: [
        { id: "tenPhim", header: "Tên Phim", fillspace: true },
        { id: "tongVe", header: "Số lượng bán nhiều nhất", fillspace: true },
        { id: "soLuongVe", header: "Số lượng bán hôm nay", fillspace: true }
    ],
    data: []
})
const tk = (e) => ({
    view: "form",
    id: "tk",
    rows: [
        {
            cols: [
                {
                    rows: [
                        {
                            view: "template",
                            template: "Chi Nhánh",
                            height: 50,
                            width: 200
                        },
                        {
                            view: "combo",
                            label: "",
                            id: "TKchiNhanh",
                            options: [],
                            value:'cn1',
                            on: {
                                onChange: function () {
                                    Service6.FillChart($$('TKchiNhanh').getValue());
                                    Service6.FillTable($$('TKchiNhanh').getValue());

                                }
                            }
                        }
                    ]
                },
                {
                    rows: [
                        {
                            view: "template",
                            template: "Thống kê vé trong 7 ngày gần nhất",
                            height: 50
                        },
                        {
                            view: "chart",
                            type: "bar",
                            id:"charTK",
                            value: "#soLuongVe#",
                            label: "#soLuongVe#",
                            radius: 0,
                            barWidth: 40,
                            tooltip: {
                                template: "#soLuongVe#"
                            },
                            yAxis: {
                                template: "",
                                start: 0, end: 100, step: 10
                            },
                            xAxis: {
                                title: "Thống kê 7 ngày gần nhất",
                                template: "'#ngay#",
                                lines: false
                            },
                            padding: {
                                left: 10,
                                right: 10,
                                top: 50
                            },
                            data: []
                        }
                    ]
                }

            ],
            height: 200
        },
        tableThongKe()
    ]
});
export default tk();