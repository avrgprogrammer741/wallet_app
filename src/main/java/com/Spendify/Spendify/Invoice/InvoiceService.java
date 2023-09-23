package com.Spendify.Spendify.Invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InvoiceService {
    private final InvoiceRepository invoiceRepository;
    private final InvoiceDTOMapper invoiceDTOMapper;

    @Autowired
    public InvoiceService(InvoiceRepository invoiceRepository, InvoiceDTOMapper invoiceDTOMapper)
    {
        this.invoiceRepository=invoiceRepository;
        this.invoiceDTOMapper = invoiceDTOMapper;
    }
    public List<InvoiceDTO> getAllInvoices(){
        return invoiceRepository.findAll().stream()
                .map(invoiceDTOMapper)
                .collect(Collectors.toList());
    }


}
