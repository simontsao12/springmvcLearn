package com.atsimoncc.ssm.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/**
 * ClassName: FileUpAndDownController
 * Package: com.atsimoncc.controller
 * Description:
 */
@Controller
public class FileUpAndDownController {

    @RequestMapping("/test/up")
    public String testUp(MultipartFile photo, HttpSession session) throws IOException {
        // 取得上傳的檔案的檔案名
        String fileName = photo.getOriginalFilename();
        // 取得上傳的檔案的後綴名(副檔名)
        String hzName = fileName.substring(fileName.lastIndexOf("."));
        // 取得 uuid
        String uuid = UUID.randomUUID().toString();
        // 拼接一個新的檔名，保證每次上傳的名稱不一樣
        fileName = uuid + hzName;
        // 取得 ServletContext 對象
        ServletContext servletContext = session.getServletContext();
        // 取得目前工程下 photo 目錄的真實路徑
        String photoPath = servletContext.getRealPath("photo");
        // 建立 photoPath 所對應的 File 對象
        File file = new File(photoPath);
        // 判斷 file 所對應目錄是否存在
        if(!file.exists()){
            file.mkdir();
        }
        String finalPath = photoPath + File.separator + fileName;
        // 上傳檔案
        photo.transferTo(new File(finalPath));
        return "success";
    }

    @RequestMapping("/test/down")
    public ResponseEntity<byte[]> testResponseEntity(HttpSession session) throws IOException {
        // 取得 ServletContext 對象
        ServletContext servletContext = session.getServletContext();
        // 取得伺服器中檔案的真實路徑
        String realPath = servletContext.getRealPath("img");
        realPath = realPath + File.separator + "1.jpg";
        // 建立輸入流
        InputStream is = new FileInputStream(realPath);
        // 建立位元組數組，is.available() 取得輸入流所對應檔案的位元組數
        byte[] bytes = new byte[is.available()];
        // 將流讀到位元組數組中
        is.read(bytes);
        // 建立 HttpHeaders 物件設定回應頭訊息
        MultiValueMap<String, String> headers = new HttpHeaders();
        // 設定要下載方式以及下載檔案的名字
        headers.add("Content-Disposition", "attachment;filename=1.jpg");
        // 設定回應狀態碼
        HttpStatus statusCode = HttpStatus.OK;
        // 建立 ResponseEntity 對象
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, headers, statusCode);
        // 關閉輸入流
        is.close();
        return responseEntity;
    }

}
