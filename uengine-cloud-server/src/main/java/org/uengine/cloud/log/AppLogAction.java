package org.uengine.cloud.log;

/**
 * Created by uengine on 2018. 1. 10..
 */
public enum AppLogAction {
    ROLLBACK_DEPLOYED_APP,
    FINISH_MANUAL_CANARY_DEPLOYMENT,
    EXCUTE_PIPELINE_TRIGGER,
    UPDATE_APP_PIPELINE_JSON,
    REMOVE_DEPLOYED_APP,
    ROLLBACK_APP,
    REMOVE_ROLLBACK_DEPLOYED_APP,
    RUN_DEPLOYED_APP_REQUEST,
    RUN_DEPLOYED_APP,
    UPDATE_APP,
    DELETE_APP,
    CREATE_APP_REQUEST,
    CREATE_APP,
    UPDATE_APP_CONFIGYML,
    PUSH,
    PIPELINE,
    START_DEPLOYED_BY_CI,
    CREATE_APP_SNAPSHOT,
    RESTORE_APP_SNAPSHOT
}
