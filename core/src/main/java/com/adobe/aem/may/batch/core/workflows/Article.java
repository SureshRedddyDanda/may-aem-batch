package com.adobe.aem.may.batch.core.workflows;

import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.granite.workflow.WorkflowException;
import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkItem;
import com.adobe.granite.workflow.exec.WorkflowProcess;
import com.adobe.granite.workflow.metadata.MetaDataMap;

@Component(service = WorkflowProcess.class,immediate = true,enabled = true,property="process.label=Article100625")

public class Article implements WorkflowProcess {

    private static final Logger LOG=LoggerFactory.getLogger(Article.class);

    @Override
    public void execute(WorkItem workItem, WorkflowSession workflowSession, MetaDataMap metaDataMap) throws WorkflowException {
       
       // Getting payload from Workflow - workItem -> workflowData -> payload
        String payloadType = workItem.getWorkflowData().getPayloadType();
        LOG.info("{}: Payload path: {}",payloadType);

        if(payloadType.equals("JCR_PATH")){

           String path = workItem.getWorkflowData().getPayload().toString();
           LOG.debug("{}: Payload path: {}", path);
            
        }

    }

}
