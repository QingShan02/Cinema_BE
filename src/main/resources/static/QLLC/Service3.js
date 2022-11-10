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
            ngay: result.data,
            maPhong: data.phong,
            maPhim: data.phim,
            giaXuatChieu: data.giaXuatChieu,
        };
        console.log(temp);
        let a = await axios.get("/api/xuatchieu/insertLichChieu",{params:temp});
        console.log(a);
        if(a.data==1){
            console.log("Thành công");
            this.ClearForm();
            this.LoadTableLichChieu();
        }else{
            console.log("Không thành công");
        }
    }
    ClearForm = () =>{
        $$('formLC').clear();
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
        $$('tableLC').clearAll();
        let {data:result} = await axios.get("/api/xuatchieu/getLichChieu");
        result.forEach(s=>{
            s.tenCN = "CGV - "+s.tenCN;
        });
        $$('tableLC').parse(result);
    }
}
export default new Service3();