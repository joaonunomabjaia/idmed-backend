package mz.org.fgh.sifmoz.backend

class UrlMappings {

    static mappings = {
        delete "/api/$controller/$id(.$format)?"(action:"delete")
        get "/api/$controller(.$format)?"(action:"index")
        get "/api/$controller/$id(.$format)?"(action:"show")
        post "/api/$controller(.$format)?"(action:"save")
        put "/api/$controller/$id(.$format)?"(action:"update")
        patch "/api/$controller/$id(.$format)?"(action:"patch")
        patch "/api/inventory/close/$id/$endDate(.$format)?"(controller:'inventory', action:'close')
        patch "/api/patient/updateuuid/$base64(.$format)?"(controller:'patient', action:'updatePatientUUID')
        post "/api/patient/search(.$format)?"(controller:'patient', action:'search')
        post "/api/patient/countSearch(.$format)?"(controller:'patient', action:'countPatientSearchResult')
        post "/api/patientTransReference/folowup(.$format)?"(controller:'patientTransReference', action:'saveReferenceLostFolowUp')
        get "/api/patient/searchByParam/$searchString/$clinicId(.$format)?"(controller:'patient', action:'searchByParam')
        get "/api/dashBoard/getRegisteredPatientByDispenseType/$year/$clinicId/$serviceCode(.$format)?"(controller:'dashBoard', action:'getRegisteredPatientByDispenseType')
        get "/api/dashBoard/getPatientsFirstDispenseByGender/$year/$clinicId/$serviceCode(.$format)?"(controller:'dashBoard', action:'getPatientsFirstDispenseByGender')
        get "/api/dashBoard/getPatientsFirstDispenseByAge/$year/$clinicId/$serviceCode(.$format)?"(controller:'dashBoard', action:'getPatientsFirstDispenseByAge')
        get "/api/dashBoard/getActivePatientPercentage/$year/$clinicId/$serviceCode(.$format)?"(controller:'dashBoard', action:'getActivePatientPercentage')
        get "/api/dashBoard/getDispenseByAge/$year/$clinicId/$serviceCode(.$format)?"(controller:'dashBoard', action:'getDispenseByAge')
        get "/api/dashBoard/getDispensesByGender/$year/$clinicId/$serviceCode(.$format)?"(controller:'dashBoard', action:'getDispensesByGender')
        get "/api/dashBoard/getStockAlert/$clinicId/$serviceCode(.$format)?"(controller:'dashBoard', action:'getStockAlert')
        get "/api/dashBoard/getStockAlertAll/$clinicId(.$format)?"(controller:'dashBoard', action:'getStockAlertAllServices')
        get "/api/dashBoard/getDashboardServiceButton/$year/$clinicId(.$format)?"(controller:'dashBoard', action:'getDashboardServiceButton')
        get "/api/patient/openmrsSession/$interoperabilityId/$openmrsBase64(.$format)?"(controller:'patient', action:'getOpenMRSSession')
        get "/api/patientVisitDetails/getLastByEpisodeId/$episodeId(.$format)?"(controller:'patientVisitDetails', action:'getLastByEpisodeId')
        get "/api/patientVisitDetails/patientId/$patientId(.$format)?"(controller:'patientVisitDetails', action:'getLastByPatientId')
        get "/api/patientVisitDetails/episode/$episodeId(.$format)?"(controller:'patientVisitDetails', action:'getAllByEpisodeId')
        get "/api/patient/openmrsSearch/$interoperabilityId/$nid/$openmrsBase64(.$format)?"(controller:'patient', action:'getOpenMRSPatient')
        get "/api/patient/clinic/$clinicId(.$format)?"(controller:'patient', action:'getByClinicId')
        get "/api/stockEntrance/clinic/$clinicId(.$format)?"(controller:'stockEntrance', action:'getByClinicId')
        get "/api/inventory/clinic/$clinicId(.$format)?"(controller:'inventory', action:'getByClinicId')
        get "/api/patientServiceIdentifier/clinic/$clinicId(.$format)?"(controller:'patientServiceIdentifier', action:'getByClinicId')
        get "/api/patientServiceIdentifier/patient/$patientId(.$format)?"(controller:'patientServiceIdentifier', action:'getByPatientId')
        //        get "/patientServiceIdentifier/service/$serviceId(.$format)?"(controller:'patientServiceIdentifier', action:'getByServiceId')
        get "/api/episode/clinic/$clinicId(.$format)?"(controller:'episode', action:'getByClinicId')
        get "/api/episode/identifier/$identifierId(.$format)?"(controller:'episode', action:'getByIdentifierId')
        get "/api/episode/getLastWithVisitByIndentifier/$identifierId/$clinicId(.$format)?"(controller:'episode', action:'getLastWithVisitByIndentifier')
        get "/api/doctor/clinic/$clinicId(.$format)?"(controller:'doctor', action:'getByClinicId')
        get "/api/patientVisit/clinic/$clinicId(.$format)?"(controller:'patientVisit', action:'getAllByClinicId')
        get "/api/patientVisitDetails/clinic/$clinicId(.$format)?"(controller:'patientVisitDetails', action:'getAllByClinicId')
        get "/api/patientVisitDetails/clinic/$clinicId(.$format)?"(controller:'patientVisitDetails', action:'getAllByClinicId')
        get "/api/patientVisitDetails/getAllofPrecription/$prescriptionId(.$format)?"(controller:'patientVisitDetails', action:'getAllofPrecription')
        get "/api/prescription/clinic/$clinicId(.$format)?"(controller:'prescription', action:'getAllByClinicId')
        get "/api/pregnancyScreening/patientVisit/$patientVisitId(.$format)?"(controller:'pregnancyScreening', action:'getAllByPatientVisit')
        get "/api/prescription/visits/$pvdsId(.$format)?"(controller:'prescription', action:'getByVisitId')
        get "/api/prescription/patient/$patientId(.$format)?"(controller:'prescription', action:'getAllPrescriptionByPatientId')
        get "/api/pack/clinic/$clinicId(.$format)?"(controller:'pack', action:'getAllByClinicId')
        get "/api/pack/patientVisitDetails/$patientVisitDetailsId(.$format)?"(controller:'pack', action:'getAllByPatientVisitDetailsId')
        get "/api/packagedDrug/pack/$packId(.$format)?"(controller:'packagedDrug', action:'getAllByPackId')
        get "/api/prescribedDrug/prescription/$prescriptionId(.$format)?"(controller:'prescribedDrug', action:'getAllByPrescriptionId')
        get "/api/prescriptionDetail/prescription/$prescriptionId(.$format)?"(controller:'prescriptionDetail', action:'getAllByPrescriptionId')
        get "/api/patientVisit/patient/$patientId(.$format)?"(controller:'patientVisit', action:'getByPatientId')
        get "/api/groupInfo/clinic/$clinicId(.$format)?"(controller:'groupInfo', action:'getByClinicId')
        get "/api/groupInfo/validadePatient/$patientId/$serviceCode/$dispenseTypeCode(.$format)?"(controller:'groupInfo', action:'validadePatient')
        get "/api/patientVisit/lastofPatient/$patientId(.$format)?"(controller:'patientVisit', action:'getLastVisitOfPatient')
        get "/api/pack/prescription/$prescriptionId(.$format)?"(controller:'pack', action:'getAllByPrescriptionId')
        get "/api/pack/patient/$patientId(.$format)?"(controller:'pack', action:'getLastPackByPatientId')
        get "/api/pack/getAllByPatient/$patientId/$serviceCode(.$format)?"(controller:'pack', action:'getAllPackByPatientId')
        get "/api/patient/reportActiveByServiceCode/"(controller:'patient', action:'getReportActiveByServiceCode')
        get "/api/migrationLog/printReport/"(controller:'migration', action:'printReport')
        post "/api/$controller/initReportProcess(.$format)?"(action:'initReportProcess')
        get "/api/$controller/printReport/$reportId(.$format)?"(action:'getProcessedData')
        get "/api/$controller/printReport/$reportId/$fileType(.$format)?"(action:'printReport')
        get "/api/$controller/getProcessingStatus/$reportId(.$format)?"(action:'getProcessingStatus')
        get "/api/$controller/getInventoryList/$reportId(.$format)?"(action:'getInventoryList')
        get "/api/$controller/printReportByInventoryId/$idInventory/$reportId(.$format)?"(action:'printReportByInventoryId')
        get "/api/$controller/printReport/$reportId(.$format)?"(action:'printReport')
        get "/api/$controller/migrationStatus(.$format)?"(action:"migrationStatus")
        get "/api/$controller/migrationStatusDetails/$stage(.$format)?"(action:"migrationStatusDetails")
        post "/api/$controller/initMigration(.$format)?"(action:"initMigration")
        delete "/api/$controller/delete/$reportId(.$format)?"(action:'deleteByReportId')
        get "/api/$controller/migrationStatusFinished(.$format)?"(action:"migrationIsFinished")
        post "/api/$controller/migrationCompleted(.$format)?"(action:"setMigrationCompleted")
        get "/api/$controller/getPatientNid/$nid(.$format)?"(action:'getDetailsByNid')
        //   get "/systemConfigs/$key(.$format)?"(action:'getByKey')
        get "/api/clinic/district/$districtId(.$format)?"(controller:'clinic', action:'searchClinicsByDistrictId')
        get "/api/clinic/province/$provinceCode(.$format)?"(controller:'clinic', action:'searchClinicsByProvinceCode')
        get "/api/groupMemberPrescription/member/$memberId(.$format)?"(controller:'groupMemberPrescription', action:'getByMemberId')
        get "/api/drugStockFile/sumary/$clinicId/$drugId(.$format)?"(controller:'drugStockFile', action:'getDrugSumaryEvents')
        get "/api/drugStockFile/batchsumary/$clinicId/$stockId(.$format)?"(controller:'drugStockFile', action:'getDrugBatchSumaryEvents')
        get "/api/drugStockFile/sumarymobile/$clinicId/$drugId(.$format)?"(controller:'drugStockFile', action:'getDrugSumaryEventsMobile')
        get "/api/drugStockFile/batchsumarymobile/$clinicId/$stockId(.$format)?"(controller:'drugStockFile', action:'getDrugBatchSumaryEventsMobile')
        get "/api/drugStockFile/drugfilemobile/$clinicId(.$format)?"(controller:'drugStockFile', action:'getDrugFileMobile')

        get "/api/patientVisitDetails/AllLastOfClinic/$clinicId(.$format)?"(controller:'patientVisitDetails', action:'getAllLastVisitOfClinic')
        get "/api/patientVisit/AllLastWithScreeningOfClinic/$clinicId(.$format)?"(controller:'patientVisit', action:'getAllLastVisitWithScreeningOfClinic')
        get "/api/pack/AllLastOfClinic/$clinicId(.$format)?"(controller:'pack', action:'getAllLastPackOfClinic')
        get "/api/prescription/AllLastOfClinic/$clinicId(.$format)?"(controller:'prescription', action:'getAllLastPrescriptionOfClinic')
        post "/api/secrUserRole/(.$format)?"(controller:'secUserRole', action:'save')
        get "/api/clinic/uuid/$uuid(.$format)?"(controller:'clinic', action:'getByUUID')
        get "/api/clinic/mainClinic(.$format)?"(controller:'clinic', action:'getMainClinic')
        get "/api/patient/openmrsProgramSearch/$interoperabilityId/$uuid/$openmrsBase64(.$format)?"(controller:'patient', action:'getOpenMRSPatientProgramDetails')
        get "/api/episode/clinicSector/$clinicSectorId(.$format)?"(controller:'episode', action:'getLastWithVisitByClinicSectors')
        get "/api/patient/clinicSector/$clinicSectorId(.$format)?"(controller:'patient', action:'getPatientsInClinicSector')
        get "/api/stock/checkStockStatus/$idPrescribedDrug/$prescriptionDate/$qtyPrescribed/$clinicId/$weeks(.$format)?"(controller:'stock', action:'checkStockStatus')
        get "/api/stock/getValidStocks/$idPackagedDrug/$packageDate(.$format)?"(controller:'stock', action:'getValidStockByDrugAndPickUpDate')
        get "/api/stock/getStocksByStockDistributor/$clinicId/$offset/$max(.$format)?"(controller:'stock', action:'getStocksByStockDistributor')
        get "/api/stockLevel/getStockLevelByClinicAndDrug/$clinicId/$drugId(.$format)?"(controller:'stockLevel', action:'getStockLevelByClinicAndDrug')


        get "/api/drug/drugFromProvicnial/$offset(.$format)?"(controller:'drug', action:'getDrugsFromProvincialServer')
        get "/api/therapeuticRegimen/therapeuticRegimenFromProvicnial/$offset(.$format)?"(controller:'therapeuticRegimen', action:'getTherapeuticRegimensFromProvincialServer')
        get "/api/identifierType/identifierTypeFromProvicnial/$offset(.$format)?"(controller:'identifierType', action:'getidentifierTypesFromProvincialServer')
        get "/api/clinic/clinicFromProvicnial/$offset(.$format)?"(controller:'clinic', action:'geClinicsFromProvincialServer')
        get "/api/clinicalService/clinicalServiceFromProvicnial/$offset(.$format)?"(controller:'clinicalService', action:'getClinicalServiceFromProvincialServer')

        get "/api/patientVisitDetails/getAllByPatient/$patientId(.$format)?"(controller:'patientVisitDetails', action:'getAllByPatientId')
        get "/api/groupMember/groupMemberInfo/$groupId(.$format)?"(controller:'groupMember', action:'getMembersInfoByGroupId')
        get "/api/groupMember/groupMemberInfoPatient/$patientId(.$format)?"(controller:'groupMember', action:'getMembersInfoByPatientId')
        get "/api/patientServiceIdentifier/value/$nidValue(.$format)?"(controller:'patientServiceIdentifier', action:'getByNidValue')
        post "/api/patient/mergeUnitePatients/$patientToHoldId/$patientToDeleteId(.$format)?"(controller:'patient', action:'mergeUnitePatients')
        get "/api/drug/getInventoryDrugs/$id(.$format)?"(controller:'drug', action:'getDrugsByInventoryId')
        get "/api/inventory/isInventoryPeriod/$clinicId(.$format)?"(controller:'inventory', action:'isInventoryPeriod')
        get "/api/stockDistributorBatch/getStockDistributorBatchByStockDistributorId/$stockDistributorId(.$format)?"(controller:'StockDistributorBatch', action:'getStockDistributorBatchByStockDistributorId')
        patch "/api/drugDistributor/updateDrugDistributorStatus/$idDrugDistributor/$status(.$format)?"(controller:'drugDistributor', action:'updateDrugDistributorStatus')
        get "/api/drugDistributor/getDistributionsByStatus/$clinicSectorId/$status(.$format)?"(controller:'DrugDistributor', action:'getDistributionsByStatus')
        get "/api/stock/clinic/$clinicId(.$format)?"(controller:'stock', action:'getByClinicId')
        get "/api/inventoryStockAdjustment/clinic/$clinicId(.$format)?"(controller:'inventoryStockAdjustment', action:'getByClinicId')
        get "/api/referedStockMoviment/clinic/$clinicId(.$format)?"(controller:'referedStockMoviment', action:'getByClinicId')
        get "/api/destroyedStock/clinic/$clinicId(.$format)?"(controller:'destroyedStock', action:'getByClinicId')
      //  post "/api/patientVisitDetails/getAllByPatientIds(.$format)?"(controller:'patientVisitDetails', action:'getAllByListPatientId')
        post "/api/patientVisit/getAllByVisitIds(.$format)?"(controller:'patientVisit', action:'getAllByVisitIds')
        post "/api/prescription/getAllByPrescriptionIds(.$format)?"(controller:'prescription', action:'getAllByPrescriptionIds')
        post "/api/pack/getAllByPackIds(.$format)?"(controller:'pack', action:'getAllByPackIds')
        post "/api/episode/getAllByEpisodeIds(.$format)?"(controller:'episode', action:'getAllByEpisodeIds')
        post "/api/patientVisit/getAllLastWithScreeningByPatientIds(.$format)?"(controller:'patientVisit', action:'getAllLastWithScreeningByPatientIds')
        get "/api/patient/ape/getAllPatientsIsAbandonment(.$format)?"(controller:'patient', action:'getAllPatientsIsAbandonment')
        post "/api/patientVisitDetails/getLastAllByPatientIds(.$format)?"(controller:'patientVisitDetails', action:'getLastAllByListPatientId')
      //  post "/api/patientVisitDetails/getAllByListPrescriptionIds(.$format)?"(controller:'patientVisitDetails', action:'getAllByListPrescriptionIds')
        post "/api/patientVisit/getAllLast3VisitsWithScreeningByPatientIds(.$format)?"(controller:'patientVisit', action:'getAllLast3VisitsWithScreeningByPatientIds')
        "/"(view:"/login/auth")
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
