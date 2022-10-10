class  Service{
    fillTable = async() =>{
        let {data:result} = await axios.get("/api/nv/getAllNV");
        result.forEach(s=>{s.gioiTinh = (s.gioiTinh==0)?"Nữ":"Nam"});
        $$('bang').parse(result);
    }
}
 
export default new Service();