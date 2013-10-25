def down(File f, String imgUrl) {
                byte[] buffer = new byte[8 * 1024];
                URL u;
                URLConnection connection = null;
                try {
                        u = new URL(imgUrl);
                        connection = u.openConnection();
                } catch (Exception e) {
                        System.out.println("ERR:" + imgUrl);
                        return;
                }
                connection.setReadTimeout(100000);
                InputStream is = null;
                FileOutputStream fos = null;
                try {
                        f.createNewFile();
                        is = connection.getInputStream();
                        fos = new FileOutputStream(f);
                        int len = 0;
                        while ((len = is.read(buffer)) != -1) {
                                fos.write(buffer, 0, len);
                        }

                } catch (Exception e) {
                        f.delete();
                } finally {
                        if (fos != null) {
                                try {
                                        fos.close();
                                } catch (IOException e) {
                                }
                        }
                        if (is != null) {
                                try {
                                        is.close();
                                } catch (IOException e) {
                                }
                        }
                }
                buffer = null;
        }
i=1051671 
while(i>0){
down(new File("D:/я╦ювобть/pic/wallpaper-${i}.jpg"),"http://wallpapers.wallbase.cc/rozne/wallpaper-${i}.jpg")
println "${i} done!"
i++
}