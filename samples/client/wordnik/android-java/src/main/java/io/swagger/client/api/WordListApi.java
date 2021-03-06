package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.WordList;
import java.util.*;
import io.swagger.client.model.StringValue;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class WordListApi {
  String basePath = "https://api.wordnik.com/v4";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
  
  public WordList  getWordListByPermalink (String permalink, String auth_token) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/wordList.json/{permalink}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "permalink" + "\\}", apiInvoker.escapeString(permalink.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    headerParams.put("auth_token", auth_token);
    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (WordList) ApiInvoker.deserialize(response, "", WordList.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return  null;
      }
      else {
        throw ex;
      }
    }
  }
  
  
  public void  updateWordList (String permalink, WordList body, String auth_token) throws ApiException {
    Object postBody = body;

    

    // create path and map variables
    String path = "/wordList.json/{permalink}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "permalink" + "\\}", apiInvoker.escapeString(permalink.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    headerParams.put("auth_token", auth_token);
    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return ;
      }
      else {
        throw ex;
      }
    }
  }
  
  
  public void  deleteWordList (String permalink, String auth_token) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/wordList.json/{permalink}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "permalink" + "\\}", apiInvoker.escapeString(permalink.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    headerParams.put("auth_token", auth_token);
    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return ;
      }
      else {
        throw ex;
      }
    }
  }
  
  
  public void  deleteWordsFromWordList (String permalink, List<StringValue> body, String auth_token) throws ApiException {
    Object postBody = body;

    

    // create path and map variables
    String path = "/wordList.json/{permalink}/deleteWords".replaceAll("\\{format\\}","json").replaceAll("\\{" + "permalink" + "\\}", apiInvoker.escapeString(permalink.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    headerParams.put("auth_token", auth_token);
    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return ;
      }
      else {
        throw ex;
      }
    }
  }
  
  
  public void  getWordListWords (String permalink, String sortBy, String sortOrder, Integer skip, Integer limit, String auth_token) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/wordList.json/{permalink}/words".replaceAll("\\{format\\}","json").replaceAll("\\{" + "permalink" + "\\}", apiInvoker.escapeString(permalink.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(sortBy)))
      queryParams.put("sortBy", String.valueOf(sortBy));
    if(!"null".equals(String.valueOf(sortOrder)))
      queryParams.put("sortOrder", String.valueOf(sortOrder));
    if(!"null".equals(String.valueOf(skip)))
      queryParams.put("skip", String.valueOf(skip));
    if(!"null".equals(String.valueOf(limit)))
      queryParams.put("limit", String.valueOf(limit));
    

    headerParams.put("auth_token", auth_token);
    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return ;
      }
      else {
        throw ex;
      }
    }
  }
  
  
  public void  addWordsToWordList (String permalink, List<StringValue> body, String auth_token) throws ApiException {
    Object postBody = body;

    

    // create path and map variables
    String path = "/wordList.json/{permalink}/words".replaceAll("\\{format\\}","json").replaceAll("\\{" + "permalink" + "\\}", apiInvoker.escapeString(permalink.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    headerParams.put("auth_token", auth_token);
    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return ;
      }
      else {
        throw ex;
      }
    }
  }
  
}
