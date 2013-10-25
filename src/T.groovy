f=new File("D:\\games\\temp")
b="D:\\games\\temp\\"
f.eachFileRecurse{
	s=it.getPath();
	if(s ==~ /.*ui_.*.dds/  ){
		println s
		ff=new File(s)
		ss=new File(b+ff.getName())
		ss.setBytes(ff.getBytes())
	}
}
println 'done'