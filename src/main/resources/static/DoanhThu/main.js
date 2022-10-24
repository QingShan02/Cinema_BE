import Service2 from './Service2.js';
const doanhthu = () => (
    {
    view: "scrollview",
    id: 've2',
    scroll: "y",
    body: {
        rows: [{
            view: "select",
            id: "combo2",
            inputWidth: 200,
            options: [],
            select:0,
            on: {
                onChange: function (s) {
                    Service2.callChart(s);
                }
            }
        }, {

            id: 'dashboard2',
            view: "chart",
            type: "stackedBar",
            value: "#tong#",
            preset: "alpha",
            height: 400,
            tooltip: {
                template: "Ngày <span class='title'>#ngay#</span><br/>Tổng <span class='title'>#tong#</span>"
            },
            xAxis: {
                template: function (obj) {
                   return  webix.Date.dateToStr("%d")(obj.$unit)
                    // return obj.$unit.getDate() == 15 ? webix.Date.dateToStr("%M")(obj.$unit) : ""
                },
                lineColor: function (obj) {
                    //  && (obj.$unit.valueOf() == (new Date(2019, 1, 1)).valueOf())
                    return (obj.$unit) ? "#737373" : "#cfcfcf"
                },
                value: function (obj) {
                    return webix.Date.strToDate("%Y.%m.%d")(obj.ngay);
                },
                units: {
                    start: new Date(2022, 8, 1),
                    end: new Date(2022, 8, 30),
                    next: function (d) {
                        return webix.Date.add(d, 1, "day", true);
                    }
                }
            },
            yAxis: {
                start: 0,
                step: 1000000,
                end: 10000000
            },
            data: [

            ]
        }]
    }
}
)

export default doanhthu();