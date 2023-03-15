# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

from . import _utilities
import typing
# Export this package's modules as members:
from .catalog import *
from .cluster import *
from .cluster_policy import *
from .dbfs_file import *
from .directory import *
from .entitlements import *
from .external_location import *
from .get_aws_assume_role_policy import *
from .get_aws_bucket_policy import *
from .get_aws_cross_account_policy import *
from .get_catalogs import *
from .get_cluster import *
from .get_cluster_policy import *
from .get_clusters import *
from .get_current_user import *
from .get_dbfs_file import *
from .get_dbfs_file_paths import *
from .get_directory import *
from .get_group import *
from .get_instance_pool import *
from .get_job import *
from .get_jobs import *
from .get_mws_credentials import *
from .get_mws_workspaces import *
from .get_node_type import *
from .get_notebook import *
from .get_notebook_paths import *
from .get_schemas import *
from .get_service_principal import *
from .get_service_principals import *
from .get_share import *
from .get_shares import *
from .get_spark_version import *
from .get_sql_warehouse import *
from .get_sql_warehouses import *
from .get_tables import *
from .get_user import *
from .get_views import *
from .get_zones import *
from .git_credential import *
from .global_init_script import *
from .grants import *
from .group import *
from .group_instance_profile import *
from .group_member import *
from .group_role import *
from .instance_pool import *
from .instance_profile import *
from .ip_access_list import *
from .job import *
from .library import *
from .metastore import *
from .metastore_assignment import *
from .metastore_data_access import *
from .metastore_provider import *
from .mlflow_experiment import *
from .mlflow_model import *
from .mlflow_webhook import *
from .model_serving import *
from .mount import *
from .mws_credentials import *
from .mws_customer_managed_keys import *
from .mws_log_delivery import *
from .mws_networks import *
from .mws_permission_assignment import *
from .mws_private_access_settings import *
from .mws_storage_configurations import *
from .mws_vpc_endpoint import *
from .mws_workspaces import *
from .notebook import *
from .obo_token import *
from .permission_assignment import *
from .permissions import *
from .pipeline import *
from .provider import *
from .recipient import *
from .repo import *
from .schema import *
from .secret import *
from .secret_acl import *
from .secret_scope import *
from .service_principal import *
from .service_principal_role import *
from .service_principal_secret import *
from .share import *
from .sql_alert import *
from .sql_dashboard import *
from .sql_endpoint import *
from .sql_global_config import *
from .sql_permissions import *
from .sql_query import *
from .sql_visualization import *
from .sql_widget import *
from .storage_credential import *
from .table import *
from .token import *
from .user import *
from .user_instance_profile import *
from .user_role import *
from .workspace_conf import *
from ._inputs import *
from . import outputs

# Make subpackages available:
if typing.TYPE_CHECKING:
    import pulumi_databricks.config as __config
    config = __config
else:
    config = _utilities.lazy_import('pulumi_databricks.config')

_utilities.register(
    resource_modules="""
[
 {
  "pkg": "databricks",
  "mod": "index/catalog",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/catalog:Catalog": "Catalog"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/cluster",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/cluster:Cluster": "Cluster"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/clusterPolicy",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/clusterPolicy:ClusterPolicy": "ClusterPolicy"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/dbfsFile",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/dbfsFile:DbfsFile": "DbfsFile"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/directory",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/directory:Directory": "Directory"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/entitlements",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/entitlements:Entitlements": "Entitlements"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/externalLocation",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/externalLocation:ExternalLocation": "ExternalLocation"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/gitCredential",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/gitCredential:GitCredential": "GitCredential"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/globalInitScript",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/globalInitScript:GlobalInitScript": "GlobalInitScript"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/grants",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/grants:Grants": "Grants"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/group",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/group:Group": "Group"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/groupInstanceProfile",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/groupInstanceProfile:GroupInstanceProfile": "GroupInstanceProfile"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/groupMember",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/groupMember:GroupMember": "GroupMember"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/groupRole",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/groupRole:GroupRole": "GroupRole"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/instancePool",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/instancePool:InstancePool": "InstancePool"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/instanceProfile",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/instanceProfile:InstanceProfile": "InstanceProfile"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/ipAccessList",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/ipAccessList:IpAccessList": "IpAccessList"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/job",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/job:Job": "Job"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/library",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/library:Library": "Library"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/metastore",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/metastore:Metastore": "Metastore"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/metastoreAssignment",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/metastoreAssignment:MetastoreAssignment": "MetastoreAssignment"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/metastoreDataAccess",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/metastoreDataAccess:MetastoreDataAccess": "MetastoreDataAccess"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/metastoreProvider",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/metastoreProvider:MetastoreProvider": "MetastoreProvider"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/mlflowExperiment",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/mlflowExperiment:MlflowExperiment": "MlflowExperiment"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/mlflowModel",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/mlflowModel:MlflowModel": "MlflowModel"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/mlflowWebhook",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/mlflowWebhook:MlflowWebhook": "MlflowWebhook"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/modelServing",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/modelServing:ModelServing": "ModelServing"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/mount",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/mount:Mount": "Mount"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/mwsCredentials",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/mwsCredentials:MwsCredentials": "MwsCredentials"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/mwsCustomerManagedKeys",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/mwsCustomerManagedKeys:MwsCustomerManagedKeys": "MwsCustomerManagedKeys"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/mwsLogDelivery",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/mwsLogDelivery:MwsLogDelivery": "MwsLogDelivery"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/mwsNetworks",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/mwsNetworks:MwsNetworks": "MwsNetworks"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/mwsPermissionAssignment",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/mwsPermissionAssignment:MwsPermissionAssignment": "MwsPermissionAssignment"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/mwsPrivateAccessSettings",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/mwsPrivateAccessSettings:MwsPrivateAccessSettings": "MwsPrivateAccessSettings"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/mwsStorageConfigurations",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/mwsStorageConfigurations:MwsStorageConfigurations": "MwsStorageConfigurations"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/mwsVpcEndpoint",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/mwsVpcEndpoint:MwsVpcEndpoint": "MwsVpcEndpoint"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/mwsWorkspaces",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/mwsWorkspaces:MwsWorkspaces": "MwsWorkspaces"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/notebook",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/notebook:Notebook": "Notebook"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/oboToken",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/oboToken:OboToken": "OboToken"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/permissionAssignment",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/permissionAssignment:PermissionAssignment": "PermissionAssignment"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/permissions",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/permissions:Permissions": "Permissions"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/pipeline",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/pipeline:Pipeline": "Pipeline"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/recipient",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/recipient:Recipient": "Recipient"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/repo",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/repo:Repo": "Repo"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/schema",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/schema:Schema": "Schema"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/secret",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/secret:Secret": "Secret"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/secretAcl",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/secretAcl:SecretAcl": "SecretAcl"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/secretScope",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/secretScope:SecretScope": "SecretScope"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/servicePrincipal",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/servicePrincipal:ServicePrincipal": "ServicePrincipal"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/servicePrincipalRole",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/servicePrincipalRole:ServicePrincipalRole": "ServicePrincipalRole"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/servicePrincipalSecret",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/servicePrincipalSecret:ServicePrincipalSecret": "ServicePrincipalSecret"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/share",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/share:Share": "Share"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/sqlAlert",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/sqlAlert:SqlAlert": "SqlAlert"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/sqlDashboard",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/sqlDashboard:SqlDashboard": "SqlDashboard"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/sqlEndpoint",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/sqlEndpoint:SqlEndpoint": "SqlEndpoint"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/sqlGlobalConfig",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/sqlGlobalConfig:SqlGlobalConfig": "SqlGlobalConfig"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/sqlPermissions",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/sqlPermissions:SqlPermissions": "SqlPermissions"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/sqlQuery",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/sqlQuery:SqlQuery": "SqlQuery"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/sqlVisualization",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/sqlVisualization:SqlVisualization": "SqlVisualization"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/sqlWidget",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/sqlWidget:SqlWidget": "SqlWidget"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/storageCredential",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/storageCredential:StorageCredential": "StorageCredential"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/table",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/table:Table": "Table"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/token",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/token:Token": "Token"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/user",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/user:User": "User"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/userInstanceProfile",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/userInstanceProfile:UserInstanceProfile": "UserInstanceProfile"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/userRole",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/userRole:UserRole": "UserRole"
  }
 },
 {
  "pkg": "databricks",
  "mod": "index/workspaceConf",
  "fqn": "pulumi_databricks",
  "classes": {
   "databricks:index/workspaceConf:WorkspaceConf": "WorkspaceConf"
  }
 }
]
""",
    resource_packages="""
[
 {
  "pkg": "databricks",
  "token": "pulumi:providers:databricks",
  "fqn": "pulumi_databricks",
  "class": "Provider"
 }
]
"""
)
