# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetClusterResult',
    'AwaitableGetClusterResult',
    'get_cluster',
    'get_cluster_output',
]

@pulumi.output_type
class GetClusterResult:
    """
    A collection of values returned by getCluster.
    """
    def __init__(__self__, cluster_id=None, cluster_info=None, id=None):
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        pulumi.set(__self__, "cluster_id", cluster_id)
        if cluster_info and not isinstance(cluster_info, dict):
            raise TypeError("Expected argument 'cluster_info' to be a dict")
        pulumi.set(__self__, "cluster_info", cluster_info)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> str:
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="clusterInfo")
    def cluster_info(self) -> 'outputs.GetClusterClusterInfoResult':
        return pulumi.get(self, "cluster_info")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetClusterResult(GetClusterResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClusterResult(
            cluster_id=self.cluster_id,
            cluster_info=self.cluster_info,
            id=self.id)


def get_cluster(cluster_id: Optional[str] = None,
                cluster_info: Optional[pulumi.InputType['GetClusterClusterInfoArgs']] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetClusterResult:
    """
    ## Example Usage

    Retrieve attributes of each SQL warehouses in a workspace

    ```python
    import pulumi
    import pulumi_databricks as databricks

    all_clusters = databricks.get_clusters()
    all_cluster = [databricks.get_cluster(cluster_id=__value) for __key, __value in data["databricks_clusters"]["ids"]]
    ```
    ## Related Resources

    The following resources are often used in the same context:

    * End to end workspace management guide
    * Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
    * ClusterPolicy to create a Cluster policy, which limits the ability to create clusters based on a set of rules.
    * InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
    * Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
    * Library to install a [library](https://docs.databricks.com/libraries/index.html) on databricks_cluster.
    * Pipeline to deploy [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html).


    :param str cluster_id: The id of the cluster
    """
    __args__ = dict()
    __args__['clusterId'] = cluster_id
    __args__['clusterInfo'] = cluster_info
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getCluster:getCluster', __args__, opts=opts, typ=GetClusterResult).value

    return AwaitableGetClusterResult(
        cluster_id=__ret__.cluster_id,
        cluster_info=__ret__.cluster_info,
        id=__ret__.id)


@_utilities.lift_output_func(get_cluster)
def get_cluster_output(cluster_id: Optional[pulumi.Input[str]] = None,
                       cluster_info: Optional[pulumi.Input[Optional[pulumi.InputType['GetClusterClusterInfoArgs']]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetClusterResult]:
    """
    ## Example Usage

    Retrieve attributes of each SQL warehouses in a workspace

    ```python
    import pulumi
    import pulumi_databricks as databricks

    all_clusters = databricks.get_clusters()
    all_cluster = [databricks.get_cluster(cluster_id=__value) for __key, __value in data["databricks_clusters"]["ids"]]
    ```
    ## Related Resources

    The following resources are often used in the same context:

    * End to end workspace management guide
    * Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
    * ClusterPolicy to create a Cluster policy, which limits the ability to create clusters based on a set of rules.
    * InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
    * Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
    * Library to install a [library](https://docs.databricks.com/libraries/index.html) on databricks_cluster.
    * Pipeline to deploy [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html).


    :param str cluster_id: The id of the cluster
    """
    ...