# TaskVariableControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVariablesUsingGET3**](TaskVariableControllerApi.md#getVariablesUsingGET3) | **GET** /v1/tasks/{taskId}/variables | getVariables

<a name="getVariablesUsingGET3"></a>
# **getVariablesUsingGET3**
> ListResponseContentOfCloudVariableInstance getVariablesUsingGET3(taskId, maxItems, skipCount, sort)

getVariables

### Example
```java
// Import classes:
//import com.alfresco.activiti.query.ApiException;
//import com.alfresco.activiti.query.handler.TaskVariableControllerApi;


TaskVariableControllerApi apiInstance = new TaskVariableControllerApi();
String taskId = "taskId_example"; // String | taskId
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfCloudVariableInstance result = apiInstance.getVariablesUsingGET3(taskId, maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskVariableControllerApi#getVariablesUsingGET3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **maxItems** | **Integer**|  | [optional]
 **skipCount** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**ListResponseContentOfCloudVariableInstance**](ListResponseContentOfCloudVariableInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json
