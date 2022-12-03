class Service6{
    FillCboChiNhanh = async()=>{
        let {data:result} = await axios.get("/api/chinhanh/getAllChiNhanh");
        let temp = result.map(s=>{
            return {id:s.maCN, value:s.tenCN}
        });
        $$('TKchiNhanh').define("options",temp);
        $$('TKchiNhanh').render();
    }
    FillChart = async (e) =>{
        let {data:result} = await axios.get("/api/ve/getSoLuongVe",{params:{maCN:e}});
        let temp = result.map(s=>{
            return {soLuongVe:s.soLuongVe, ngay:s.ngay}
        })
        $$("charTK").clearAll();
        $$("charTK").define("data",temp);
        $$("charTK").refresh();
    }
    FillTable = async(e) =>{
        let {data:result} = await axios.get("/api/ve/countVeByPhim",{params:{maCN:e}});
        let temp = result.map(s=>{
            return {soLuongVe:s.soLuongVe, tenPhim:s.tenPhim, tongVe: s.tongVe}
        })
        $$("tableTK").clearAll();
        $$("tableTK").parse(temp);
    }
}
export default new Service6;