// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "databricks:index/awsS3Mount:AwsS3Mount":
		r = &AwsS3Mount{}
	case "databricks:index/azureAdlsGen1Mount:AzureAdlsGen1Mount":
		r = &AzureAdlsGen1Mount{}
	case "databricks:index/azureAdlsGen2Mount:AzureAdlsGen2Mount":
		r = &AzureAdlsGen2Mount{}
	case "databricks:index/azureBlobMount:AzureBlobMount":
		r = &AzureBlobMount{}
	case "databricks:index/catalog:Catalog":
		r = &Catalog{}
	case "databricks:index/cluster:Cluster":
		r = &Cluster{}
	case "databricks:index/clusterPolicy:ClusterPolicy":
		r = &ClusterPolicy{}
	case "databricks:index/dbfsFile:DbfsFile":
		r = &DbfsFile{}
	case "databricks:index/directory:Directory":
		r = &Directory{}
	case "databricks:index/externalLocation:ExternalLocation":
		r = &ExternalLocation{}
	case "databricks:index/gitCredential:GitCredential":
		r = &GitCredential{}
	case "databricks:index/globalInitScript:GlobalInitScript":
		r = &GlobalInitScript{}
	case "databricks:index/grants:Grants":
		r = &Grants{}
	case "databricks:index/group:Group":
		r = &Group{}
	case "databricks:index/groupInstanceProfile:GroupInstanceProfile":
		r = &GroupInstanceProfile{}
	case "databricks:index/instancePool:InstancePool":
		r = &InstancePool{}
	case "databricks:index/instanceProfile:InstanceProfile":
		r = &InstanceProfile{}
	case "databricks:index/ipAccessList:IpAccessList":
		r = &IpAccessList{}
	case "databricks:index/job:Job":
		r = &Job{}
	case "databricks:index/library:Library":
		r = &Library{}
	case "databricks:index/metastore:Metastore":
		r = &Metastore{}
	case "databricks:index/metastoreAssignment:MetastoreAssignment":
		r = &MetastoreAssignment{}
	case "databricks:index/metastoreDataAccess:MetastoreDataAccess":
		r = &MetastoreDataAccess{}
	case "databricks:index/mlflowExperiment:MlflowExperiment":
		r = &MlflowExperiment{}
	case "databricks:index/mlflowModel:MlflowModel":
		r = &MlflowModel{}
	case "databricks:index/mlflowWebhook:MlflowWebhook":
		r = &MlflowWebhook{}
	case "databricks:index/mount:Mount":
		r = &Mount{}
	case "databricks:index/mwsCredentials:MwsCredentials":
		r = &MwsCredentials{}
	case "databricks:index/mwsCustomerManagedKeys:MwsCustomerManagedKeys":
		r = &MwsCustomerManagedKeys{}
	case "databricks:index/mwsLogDelivery:MwsLogDelivery":
		r = &MwsLogDelivery{}
	case "databricks:index/mwsNetworks:MwsNetworks":
		r = &MwsNetworks{}
	case "databricks:index/mwsPrivateAccessSettings:MwsPrivateAccessSettings":
		r = &MwsPrivateAccessSettings{}
	case "databricks:index/mwsStorageConfigurations:MwsStorageConfigurations":
		r = &MwsStorageConfigurations{}
	case "databricks:index/mwsVpcEndpoint:MwsVpcEndpoint":
		r = &MwsVpcEndpoint{}
	case "databricks:index/mwsWorkspaces:MwsWorkspaces":
		r = &MwsWorkspaces{}
	case "databricks:index/notebook:Notebook":
		r = &Notebook{}
	case "databricks:index/oboToken:OboToken":
		r = &OboToken{}
	case "databricks:index/permissions:Permissions":
		r = &Permissions{}
	case "databricks:index/pipeline:Pipeline":
		r = &Pipeline{}
	case "databricks:index/repo:Repo":
		r = &Repo{}
	case "databricks:index/schema:Schema":
		r = &Schema{}
	case "databricks:index/secret:Secret":
		r = &Secret{}
	case "databricks:index/secretAcl:SecretAcl":
		r = &SecretAcl{}
	case "databricks:index/secretScope:SecretScope":
		r = &SecretScope{}
	case "databricks:index/servicePrincipal:ServicePrincipal":
		r = &ServicePrincipal{}
	case "databricks:index/sqlDashboard:SqlDashboard":
		r = &SqlDashboard{}
	case "databricks:index/sqlEndpoint:SqlEndpoint":
		r = &SqlEndpoint{}
	case "databricks:index/sqlGlobalConfig:SqlGlobalConfig":
		r = &SqlGlobalConfig{}
	case "databricks:index/sqlPermissions:SqlPermissions":
		r = &SqlPermissions{}
	case "databricks:index/sqlQuery:SqlQuery":
		r = &SqlQuery{}
	case "databricks:index/sqlVisualization:SqlVisualization":
		r = &SqlVisualization{}
	case "databricks:index/sqlWidget:SqlWidget":
		r = &SqlWidget{}
	case "databricks:index/storageCredential:StorageCredential":
		r = &StorageCredential{}
	case "databricks:index/table:Table":
		r = &Table{}
	case "databricks:index/token:Token":
		r = &Token{}
	case "databricks:index/user:User":
		r = &User{}
	case "databricks:index/userInstanceProfile:UserInstanceProfile":
		r = &UserInstanceProfile{}
	case "databricks:index/userRole:UserRole":
		r = &UserRole{}
	case "databricks:index/workspaceConf:WorkspaceConf":
		r = &WorkspaceConf{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:databricks" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, _ := PkgVersion()
	pulumi.RegisterResourceModule(
		"databricks",
		"index/awsS3Mount",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/azureAdlsGen1Mount",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/azureAdlsGen2Mount",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/azureBlobMount",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/catalog",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/cluster",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/clusterPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/dbfsFile",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/directory",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/externalLocation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/gitCredential",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/globalInitScript",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/grants",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/group",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/groupInstanceProfile",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/instancePool",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/instanceProfile",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/ipAccessList",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/job",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/library",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/metastore",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/metastoreAssignment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/metastoreDataAccess",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/mlflowExperiment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/mlflowModel",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/mlflowWebhook",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/mount",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/mwsCredentials",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/mwsCustomerManagedKeys",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/mwsLogDelivery",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/mwsNetworks",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/mwsPrivateAccessSettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/mwsStorageConfigurations",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/mwsVpcEndpoint",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/mwsWorkspaces",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/notebook",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/oboToken",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/permissions",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/pipeline",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/repo",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/schema",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/secret",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/secretAcl",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/secretScope",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/servicePrincipal",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/sqlDashboard",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/sqlEndpoint",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/sqlGlobalConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/sqlPermissions",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/sqlQuery",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/sqlVisualization",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/sqlWidget",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/storageCredential",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/table",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/token",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/user",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/userInstanceProfile",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/userRole",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"databricks",
		"index/workspaceConf",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"databricks",
		&pkg{version},
	)
}
