class Service3{
    LoadChiNhanh = async() =>{
        let {data:result} = await axios.get("/api/chinhanh/getAllChiNhanh");
        const temp = result.map(s=>{
            return {id:s.maCN, value:"CGV "+s.tenCN }
        });
        // console.log(temp);
        $$('chiNhanh').define("options",temp);
        $$('chiNhanh').render();
    }
    GetIDNgay = async(data,value) =>{
        // console.log(value);
        let result = await axios.get("/api/ngay/getID",{params:value});
        let temp ={
            Stt: result.data,
            maPhong: data.phong,
            maPhim: data.phim,
            giaXuatChieu: data.giaXuatChieu,
            maCN: data.chiNhanh
        }
        console.log(temp);
       
    }
    LoadPhong = async(value)=>{
        let {data:result} = await axios.get("/api/phongchieu/getAllPhongChieu",{params:{maCN:value}});
        const temp = result.map(s=>{
            return {id:s.maPhong, value:s.tenPhong }
        });
        $$('phong').define("options",temp);
        $$('phong').render();
    }
    LoadPhim = async()=>{
        let {data:result} = await axios.get("/api/phim/getAllPhim");
        const temp = result.map(s=>{
            return {id:s.maPhim, value:s.tenPhim }
        });
        $$('phim').define("options",temp);
        $$('phim').render();
    }
    LoadTableLichChieu = async() =>{
        let {data:result} = await axios.get("/api/xuatchieu/getLichChieu");
        console.log(result);
        $$('tableLC').parse(result);
    }
}
export default new Service3();